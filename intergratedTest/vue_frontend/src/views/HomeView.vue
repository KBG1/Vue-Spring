<script setup>
import FreeBoard from '@/components/FreeBoard.vue';
import PopularPost from '@/components/PopularPost.vue'
</script>

<template>
  <div class="background">
    <main>
      <article>
        <h2>인기 글</h2>
        <ul class="popularPost">
          <PopularPost v-for="num in 5" :key="num" />
          <RouterLink class="more" :to="{ name: 'popularPost' }">더 보기</RouterLink>
        </ul>
      </article>
      <article>
        <h2>자유 게시판</h2>
        <ul class="freeBoard">
          <FreeBoard v-for="k in 5" :key="k" :k="k"/>
          <RouterLink class="more" :to="{ name: 'freeBoard' }">더 보기</RouterLink>
        </ul>
      </article>
    </main>
  </div>
</template>

<style>
h2 {
  font-family: 'SOGANG_UNIVERSITY_FOR_WINDOWS';
  width: 100%;
  margin: 0;
  padding: 10px;
  margin-top: 10px;
}

.popularPost, .freeBoard {
  position: relative;
  width: 90%;
  list-style-type: none;
  border: 1px solid black;
  padding: 10px;
  margin-left: 15px;
  display: flex;
  justify-content: start;
}

.more {
  position: absolute;
  right: 5px;
  top: 0;
  padding: 3px;
  text-decoration: none;
  font-family: 'SOGANG_UNIVERSITY_FOR_WINDOWS';
  color: black;
}

.background {
  border-top: 1px solid transparent;
  padding: 15px;
}
</style>