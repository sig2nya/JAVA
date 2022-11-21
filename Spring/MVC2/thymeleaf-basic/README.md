basic expressions
=================
1. 간단한 표현 :
 - 변수 표현식 : ${...}
 - 선택 변수 표현식 : \*{...}
 - 메시지 표현식 : #{...}
 - 조각 표현식 : ~{...}

2. 리터럴 :
 - 텍스트 : 'one text', 'Another one!', ...
 - 숫자 : 0, 34, 0.0, 12.3, ...
 - 불린 : true, false
 - 널 : null
 - 리터럴 토큰 : one, sometext, main, ...

3. 문자 연산 :
 - 문자 합치기 : +
 - 리터럴 대체 : |The name is ${name}|

4. 산술 연산
 - Binary operators : +, -, \*, /, %
 - Minus sign (unary operator) : -

5. 불린 연산 :
 - Binary operators : and, or
 - Boolean negation (unary operator) : !, not

6. 비교와 동등 :
 - 비교 : >, <, >=, <= (gt, lt, ge, le)
 - 동등 연산 : ==, != (eq, ne)

7. 조건 연산 :
 - If-then : (if) ? (then)
 - If-then-else : (if) ? (then) : (else)
 - Default : (value) ?: (defaultvalue)

8. 특별한 토큰:
 - No-Operation : _
