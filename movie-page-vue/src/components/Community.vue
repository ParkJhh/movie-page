<template>

    <main>
        <div id="pageHead">
            <h1>Community</h1> 
        </div>
        <div id="communityTable" class="border border-dark-subtle">
            <table class="table table-hover">
                <thead class="table-dark">
                <tr>
                <td>No.</td>
                <td>제목</td>
                <td>작성자</td>
                <td>조회수</td>
                <td>작성일</td>
                <td>수정일</td>
                </tr>
                </thead>
                <tbody class="table-group-divider">
                <tr>
                <td>1</td>
                <td>테스트</td>
                <td>테스트</td>
                <td>확인용</td>
                <td>눈으로</td>
                <td>봅니다</td>
                </tr>
                <tr>
                <td>2</td>
                <td>테스트</td>
                <td>테스트</td>
                <td>확인용</td>
                <td>눈으로</td>
                <td>봅니다</td>
                </tr>
                </tbody>
            </table>
        </div>
        
        <nav aria-label="Page navigation example"> 
        <ul class="pagination justify-content-center" id="pagination">
            <li>
                <a class="page-link" @click="moveToPrevPage">Previous</a>
            </li>
            <li>
                <a class="page-link" @click="pageMove(page + pagenationNum)">{{ page + pagenationNum }}</a>
            </li>
            <li >
                <a class="page-link" @click="moveToNextPage">Next</a>
            </li>
        </ul>
    </nav>

    </main>
</template>

<script>

</script>

<style scoped>

#pageHead {
  margin: 1%;
}

#communityTable{
    text-align: center;
    justify-content: center;
    display: flex;
    margin-bottom: 1%;
}

thead {
    color: white;
}

table tbody tr {
  background-color: white !important;
}

</style>