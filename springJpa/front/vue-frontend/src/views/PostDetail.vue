<template>
<div>
<h1>Post Detail page</h1>
<h1>This is an id: {{this.$route.params.id}} <br></h1>
</div>
</template>
<script>
import { Post } from '../api'
export default {
data() {
return {
post: null,
loading: true
}
},
created() {
this.fetchData()
},
watch: {
'$route': 'fetchData'
},
methods: {
fetchData() {
this.post= null
this.loading= true
Post.get(this.$route.params.id)
.then(data => {
this.post= data
this.loading= false
})
}
}
}
</script>
