<template>
  <div>
    <Header/>
    <RouterView/>
  </div>
</template>

<script setup>
import Header from '@/components/Header.vue'
</script>

<style>
  html, body {
    width: 100%;
    height: 100%;
    margin: 0;
    padding: 0;
    background-color: cornsilk;
  }
</style>
