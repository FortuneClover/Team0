Team0
DSBA first team projects (testing)

프로젝트 개요
프로젝트명
Coffee Ordering System

프로젝트 설명
이 프로그램은 사용자가 직접 커피 메뉴를 선택하고 주문 및 결제할 수 있는 콘솔 기반 애플리케이션입니다.

개발 목표
사용자 친화적인 메뉴 화면 제공

메뉴 선택 및 주문 기능 구현

총 판매액 및 결제 내역 관리

기능 명세서
1. 메인 메뉴 화면
기능: 사용자가 메뉴를 선택할 수 있는 화면을 출력

속성값: menu_items (메뉴 목록), welcome_message (환영 메시지)

데이터 타입: menu_items는 String[] 또는 List<String>

세부 기능:

메뉴 목록을 화면에 표시합니다.

사용자로부터 메뉴 선택을 입력받습니다.

2. 주문 처리 기능
기능: 사용자가 선택한 메뉴를 주문하고 금액을 계산

속성값: selected_menu (선택된 메뉴), price (가격), quantity (수량)

데이터 타입: selected_menu는 String, price와 quantity는 int

세부 기능:

사용자 입력에 따라 가격을 계산합니다.

주문 내역을 출력합니다.

클래스 및 속성값 명세
클래스: CoffeeStore
속성값(Variables)

menu: List<Menu> (메뉴 목록)

orders: List<Order> (주문 목록)

total_sales: int 또는 double (총 판매액)

기능(Methods)

displayMenu(): 메뉴를 화면에 보여주는 기능

processOrder(): 주문을 처리하는 기능

calculateTotalSales(): 총 판매액을 계산하는 기능

클래스: Menu
속성값(Variables)

name: String (메뉴 이름)

price: int (가격)

기능(Methods)

getName(): 메뉴 이름을 반환

getPrice(): 가격을 반환

clone repository
git clone https://github.com/FortuneClover/Team0.git
cd Team0



시작하기
git config user.name [git 닉네임]
git config user.email [git 메일 주소]


기미내