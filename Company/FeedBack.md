validationVO를 insert에 넣어서 검증할 것, 시스템에 유연하게 짜도록 VO를 구성해야한다. </br>
스칼라 subquery 저렇게 짜면 안됨 -> 병목지점이 되어서 데이터가 많아지면(최소 100만 이상), </br>
application level에서 enum으로 바꿔주는 것, </br>
case문은 application level에서 바꿔주는 것이 제일 낫다. </br>
가공은 애플리케이션에서 하는게 제일 낫다… orderby 웬만하면 seq로 하는게 제일 나음, </br>
DB에 Insert할때 기본값 VO로 세팅할 것 </br>
