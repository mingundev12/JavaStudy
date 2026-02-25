여러가지 sql 함수

select * from item where category = '총';

select user_id as loginid from user;
select * from user;
select address, tel from user;
select * from user join cart where user.id = cart.user_id;

select address, tel, status from user, cart;

select u.user_id, c.user_id from user u, cart c;


select count(id) as count_id from user;

select count(*) as count from item;
select sum(item_qa) from item;
select avg(item_price) from item;
select max(item_price) from item;
select min(item_price) from item;

select item_name from item where item_price = (select max(item_price) from item);

select day(created_at) from user;

select datediff('2026-01-21', created_at) from user;
select datediff(now(), created_at) from user;

select date_add(created_at, interval 5 day) from user;
select date_sub(created_at, interval 13 day) from user;

select left(item_detail, 3) from item;

select distinct category from item;
select category from item;

select count(distinct category) as count_category from item;

select * from item where item_price > 2000000;

select * from item where item_price > 2000000 and item_qa >= 10;

select * from item where item_qa <= 10 and status = 'soldout';


select * from item where item_price <= 50000000 and category = '미사일';

select * from user
where user_id = 'mgdev12'
and password = 'dv12';


select * from item
where left(item_name, 1) = 'f'; => X

select * from item
where item_name like 'F%';

select * from item
where item_name like '%F%';

select * from item
where item_name like '%F%' or item_detail like '%F%';

select * from item
where id between 11 and 15;

select * from item
where item_price between 5000000 and 20000000;

select * from item
where item_detail between '가' and '라';

select * from item
where item_price > 20000000 limit 3, 4;


select * from item 
where category = '총' or category = '탱크';


select * from orders
where order_at between '2025-09-10' and '2025-09-20';


select * from orders order by order_at desc;

select category, count(*) from item group by category;

select category, sum(item_price) from item group by category;

select category from item 
where item_price > 20000000 group by category;

select category from item 
group by category having count(*) >= 8;

select category from item 
where item_price > a
group by category having avg(item_price) as a; => X

select category from item
group by category order by avg(item_price) desc limit 1;


select status, count(*) as count from item group by status;



## join

* inner join - 두 테이블 모두 일치하는 경우

select u.tel, c.status
from user u inner join cart c
on u.id = c.user_id;

select i.item_name 
from cart_list cl inner join item i
on cl.item_id = i.id;


* left join - 왼쪽 테이블은 전부 조회, 오른쪽은 있으면 하고 없으면 조회결과없음
  
select o.total_price, i.item_name
from item i left join order_detail o
on o.item_id = i.id;

* right join - 오른쪽 테이블은 전부 조회, 왼쪽은 있으면 출력 => left join 과 기능적으로 차이가 없기 때문에 left join 을 주로 사용한다.

* join 언제 하나? : 다른 테이블의 데이터도 필요한 경우
                   관계형성된 테이블 (1:1, 1:n, ....)
                   컬럼이 다른 테이블  => 정규화로 인해 분리된 테이블을 하나로 모아서 보기 위함






select u.user_id, u.address
from user u join cart c on u.id = c.user_id ;

select u.user_id, u.address, c.id as 장바구니번호
from user u join cart c on u.id = c.user_id
where u.user_id = 'lee';



select i.item_name, i.item_price
from cart_list cl join item i on cl.item_id = i.id
where cl.cart_id = 2;

select i.item_name, i.item_price
from cart_list cl join item i on cl.item_id = i.id
where cl.cart_id = (
select c.id
from user u join cart c on u.id = c.user_id 
where u.user_id = 'park'
);

select i.item_name, i.item_price
from item i
join cart_list cl on i.id = cl.item_id
join cart c on c.id = cl.cart_id 
join user u on c.user_id = u.id 
where u.user_id = 'mgdev12';
