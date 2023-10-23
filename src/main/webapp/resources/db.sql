CREATE TABLE `tbl_todo` (
    `tno` int auto_increment PRIMARY KEY,
    `title` varchar(100) not null,
    `dueDate` date not null,
    `writer` varchar(50) not null,
    `finished` tinyint default 0
);
