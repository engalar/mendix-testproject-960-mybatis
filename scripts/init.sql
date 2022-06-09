DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `student_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `phone` varchar(20) DEFAULT NULL COMMENT '电话',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `sex` tinyint(4) DEFAULT NULL COMMENT '性别',
  `locked` tinyint(4) DEFAULT NULL COMMENT '状态(0:正常,1:锁定)',
  `gmt_created` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '存入数据库的时间',
  `gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改的时间',
  `delete` int(11) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE = InnoDB AUTO_INCREMENT = 7 DEFAULT CHARSET = utf8mb4 COMMENT = '学生表';

INSERT INTO `student` (`name`, `sex`) VALUES ('大明', '1');
INSERT INTO `student` (`name`, `sex`) VALUES ('小红', '0');
UPDATE `student` SET `locked` = '0' WHERE (`student_id` = '1');
UPDATE `student` SET `locked` = '1' WHERE (`student_id` = '2');