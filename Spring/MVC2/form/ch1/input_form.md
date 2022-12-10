입력 폼 처리
============
### 1. thymeleaf가 제공하는 입력 폼 기능을 적용하여 폼 코드를 thymeleaf가 지원하는 기능을 사용하여 개선
 - th:object : 커맨드 객체 지정
 - *{...} : 선택 변수 식. th:object에서 지정한 객체에 접근
 - th:field : HTML태그의 id / name / value 속성을 자동 처리

### 2. 렌더링 전 / 후
 - 렌더링 전 : \<input type="text" th:field="*{itemName}"/>
 - 렌더링 후 : \<input type="text" id="itemName" name="itemName" th:value="*{itemName}"/>

### 3. 등록 폼
 - th:object를 적용하기 위해 해당 오브젝트 정보를 전달.
```java
@GetMapping("/add")
public String addForm(Model model){
  model.addAttribute("item", new Item());  // Item 객체는 itemName, price, quantity 속성을 
  return "form/addForm";
}
```

### 4. HTML source
```html
<form action="item.html" th:action th:object="${item}" method="post"> -> th:object="${item}"을 통해 form에서 사용할 객체 지정
  <input type="text" id="itemName" th:field="*{itemName}">
  -> *{...}를 통하여 객체의 속성에 접근 가능. id / name / value 속성을 자동으로 생성해준다. 참고로, 해당 태그에서 id 부분을 지워도 th:field가 자동으로 생성해준다.
  <input type="text" id="price" th:field="*{price}">
  <input type="text" id="quantity" th:field="*{quantity}">
</form>
```
