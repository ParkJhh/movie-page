<template>
    <div>
        <h1>SignUp</h1>
    </div>
    
    <form
        @submit.prevent
        class="d-flex flex-column gap-3 border border-5 p-5"
      >
        <div class="d-flex gap-3">
          <input
            type="text"
            placeholder="사용할 아이디"
          />
          <button
            data-bs-toggle="modal"
            data-bs-target="#alertModal"
            class="button"
          >
            아이디중복체크
          </button>
        </div>

        <input type="text" placeholder="이름" />

        <input type="password" placeholder="비밀번호" />
        <input type="password" placeholder="비밀번호 확인" />
        <input type="email" placeholder="Email" />
        <input type="text" placeholder="핸드폰번호 ex)010-xxxx-xxxx"/>

        <div class="d-flex gap-3">
          <input type="text" readonly id="zipcode" placeholder="우편번호" />

          <button class="button icon fa-search">
            주소 검색
          </button>
        </div>
        <div class="d-flex gap-3">
          <input type="text" readonly id="address" placeholder="주소" />
        </div>
        <input type="text" id="address2" placeholder="상세한 주소"/>

        <div class="d-flex flex-fill gap-3 justify-content-start" id="birth-gender">
          <div class="birth-gender">
            생년월일:
            <input
              type="date"
              id="birthday"
              placeholder="생년월일"
            />
          </div>
          <div class="birth-gender">
            성별:
            <input
              type="radio"
              id="male"
              name="gender" value="0"
            />
            <label for="male" id="gender" class="m-0">남성</label>
            <input
              type="radio"
              id="female"
              name="gender"
              value="1"
            />
            <label for="female" id="gender" class="m-0">여성</label>
          </div>
        </div>
      </form>
      <button
        class="button"
        data-bs-toggle="modal"
        data-bs-target="#alertModal"
      >
        회원가입 확인
      </button>

</template>