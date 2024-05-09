<template>
    <div id="pageHead">
        <h1>Find Id or Password</h1>
    </div>

    <div class="d-flex justify-content-center">
        <div id="findIdForm">
            <form class="d-flex flex-column border border-5 gap-4 rounded-4">
                <input id="userInput" class="rounded-3" type="text" placeholder="이름" />
                <input id="userInput" class="rounded-3" type="password" placeholder="이메일주소" />

                <div id="findIdButton" class="d-flex justify-content-center">
                    <button data-bs-toggle="modal" data-bs-target="#alertModal" class="btn btn-secondary" > 아이디 찾기 </button>
                </div>
            </form>
        </div>

        <div id="findPwForm"> 
            <form class="d-flex flex-column border border-5 gap-4 rounded-4">
                <input id="userInput" class="rounded-3" type="text" placeholder="아이디" />
                <input id="userInput" class="rounded-3" type="password" placeholder="이메일주소" />
                <input id="userInput" class="rounded-3" type="text" placeholder="핸드폰번호 ex)010-xxxx-xxxx"/>

                <div id="findPwButton" class="d-flex justify-content-center">
                    <button data-bs-toggle="modal" data-bs-target="#alertModal" class="btn btn-secondary" > 비밀번호 리셋 </button>
                </div>
            </form>
        </div>
    </div>

</template>

<script>
</script>

<style scoped>

#pageHead {
  margin: 1%;
}

#findIdForm, #findPwForm {
  flex-wrap: wrap;
  justify-content: center;
  width: 80%;
  height: 80%;
  margin-top: 1%;
  margin-left: 5%;
  margin-right: 5%;
  margin-bottom: 5%;
}

#userInput {
  margin-top: 1%;
  margin-left: 10%;
  margin-right: 10%;
}

.find {
  color: #767d85;
}

#findIdButton, #findPwButton {
  margin-bottom: 2%;
}

</style>