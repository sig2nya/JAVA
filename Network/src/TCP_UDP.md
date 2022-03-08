TCP/UDP 통신(Socket 이용)
=======================
>* TCP
>* * Transmission Control Protocol, 연결 지향 프로토콜이다. 데이터의 신뢰성을 보장해주며, 연결이 확립된 상태에서 통신을 시도한다.
>* * Client -> Server로의 요청시, 3-Way-HandShaking을 통하여 통신을 먼저 확립시킨다.
>* * Server가 Client와의 통신이 종료되었을 때, 4-Way-HandShaking을 통하여 통신을 종료한다.
>* JAVA에서는 ServerSocket Class를 이용하여 Socket을 생성할 수 있다. 마찬가지로, Client에서는 Socket Class를 이용하여 생성

>* UDP
>* * User Datagram Protocol, 비연결형 프로토콜이다. 따로 연결을 확립하지 않으며 데이터의 신뢰성이 떨어진다. 또한, 서버측에서는 수신측이 데이터를 수신하였는지 확인이 불가능하다.
>* * Server -> Client로의 전송으로만 통신이 종료된다.
>* JAVA에서는 DatagramSocket Class를 이용하여 ServerSocket을 생성할 수 있다.