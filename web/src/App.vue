<template>
  <div>
    <div>BOT昵称：{{ botName}}</div>
    <div>BOT战力：{{ botRating }}</div>
  </div>
  <router-view/>
</template>

<script>
import $ from 'jquery'
import { ref } from 'vue'

export default {
  name: "APP",
  setup: () => {
    let botName = ref("");
    let botRating = ref("");

    $.ajax({
      url: "http://localhost:3000/pk/getBotInfo/",
      type: "get",
      success: resp => {
        botName.value = resp.name;
        botRating.value = resp.rating;
      }
    });
    return {
      botName,
      botRating
    }
  }
}
</script>

<style>
body {
  background-image: url("@/assets/background.jpg");
  background-size: cover;
}
</style>
