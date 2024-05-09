<template>
  <div>
    <!-- 헤더 바 -->
    <div class="headerBar">
      <RouterLink :to="{ name: 'home' }"
        ><img class="logo" src="@/assets/health.jpg" alt="로고 없음"
      /></RouterLink>
      <div class="route">
        <RouterLink :to="{ name: 'user' }">유저</RouterLink>
        <RouterLink :to="{ name: 'movie' }">영상</RouterLink>
        <RouterLink :to="{ name: 'login' }" class="login">로그인</RouterLink>
      </div>
    </div>
    <!-- 라우트 컴포넌트 렌더링 -->
  </div>
</template>

<script setup>
import { useRoute } from 'vue-router'

const route = useRoute()
const isHomeRoute = route.name === 'home'
const isUserRoute = route.name === 'user'
</script>

<style>
.headerBar {
  background-color: #999999;
  display: flex;
  align-items: center;
  padding: 5px;
}

.logo {
  width: 60px;
  height: 60px;
  border-radius: 50%;
  margin-right: 10px;
}


.route {
  width: 100%;
  display: flex;
  justify-content: flex-start;
  margin: 10px;
  font-style: normal;
  font-weight: 500;
  font-size: x-large;
  font-family: 'SOGANG_UNIVERSITY_FOR_WINDOWS', sans-serif;
  color: white; 
}

.route a {
  margin-right: 15px; /* 오른쪽 마진 설정 */
  color: white;
  text-decoration: none;
}

.route .login {
  margin-left: auto;
}
</style>
