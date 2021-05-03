<template>
<div id="app">
<div id="nav">
<router-link to="/home">Home</router-link>
<router-link to="/about">About</router-link>
<router-link to="/foo"> FOO</router-link>
<router-link to="/posts"> Posts</router-link>
<router-link to="/posts/new" exact>New Post</router-link>
<router-link to="/posts/detail" exact>Detail Post</router-link>
<router-link to="/test" >test</router-link>

</div>
<router-view/>
</div>
</template>
<style>
#app {
font-family: 'Avenir', Helvetica, Arial, sans-serif;
-webkit-font-smoothing: antialiased;
-moz-osx-font-smoothing: grayscale;
text-align: center;
color: #2c3e50;
margin-top: 60px;
}
.router-link-active {
color: white;
background-color: red;
}
.router-link-exact-active {
color: white;
background-color: blue;
}
</style>

