/*
Navicat MySQL Data Transfer

Source Server         : mabin_MySQL
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : it_jinsu

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2017-11-21 18:03:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for assignment
-- ----------------------------
DROP TABLE IF EXISTS `assignment`;
CREATE TABLE `assignment` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `qq` varchar(20) DEFAULT NULL,
  `occupation` varchar(25) DEFAULT NULL,
  `enrolltime` bigint(20) DEFAULT NULL,
  `graduatefrom` varchar(50) DEFAULT NULL,
  `snumber` varchar(20) DEFAULT NULL,
  `reportlink` varchar(255) DEFAULT NULL,
  `desire` varchar(255) DEFAULT NULL,
  `seniorname` varchar(50) DEFAULT NULL,
  `realizefrom` varchar(50) DEFAULT NULL,
  `create_at` bigint(20) DEFAULT NULL,
  `update_at` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
