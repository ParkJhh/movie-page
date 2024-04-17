<template>
    <div>
        <h1>Login</h1>
    </div>

    <div>
        <form
        class="d-flex flex-column border border-5 gap-4"
      >
        <input type="text" placeholder="아이디" />
        <input type="password" placeholder="비밀번호" />

        <div class="d-flex justify-content-between flex-column-on-small-screen">
          <div>
            <input
              type="checkbox"
              id="idsave"
              name="idsave"
            />
            <label for="idsave">아이디 저장</label>
          </div>

          <div>
            <input
              type="checkbox"
              id="autologin"
              name="autologin"
            />
            <label for="autologin">자동 로그인</label>
          </div>
        </div>

        <div class="find">
          <a @click="$router.push('/find')" style="color: #767d85"
            >아이디 / 비밀번호 찾기</a
          >
        </div>
        
        <div class="d-flex justify-content-center">
          <button
            data-bs-toggle="modal"
            data-bs-target="#alertModal"
            class="button small"
          >
            로그인
          </button>
        </div>
      </form>
    </div>
</template>