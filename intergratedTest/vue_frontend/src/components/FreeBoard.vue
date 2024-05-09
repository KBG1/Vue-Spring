<template>
    <li class="post1">
        <img :src="getImageUrl(`dog${k}`)" class="thumbnail1" alt="에러">
        <h5>갱얼쥐</h5>
        <h6>귀엽지 않나요?</h6>
    </li>
</template>

<script setup>
import { defineProps } from 'vue';

const props = defineProps({
    k: Number
})

const getImageUrl = (name) => {
    const url = new URL(`../assets/dog/${name}.jpg`, import.meta.url).href;
    return url
}
</script>

<style>
.post1 {
    border: 1px solid black;
    padding: 15px;
    text-align: center;
    margin-left: 15px;
}

.thumbnail1 {
    width: 75px;
    height: 75px;
    border-radius: 50%;
}

</style>