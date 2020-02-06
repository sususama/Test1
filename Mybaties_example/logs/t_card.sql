/*
Navicat MySQL Data Transfer

Source Server         : mybendi
Source Server Version : 50173
Source Host           : localhost:3306
Source Database       : cms

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2019-10-05 21:13:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_card
-- ----------------------------
DROP TABLE IF EXISTS `t_card`;
CREATE TABLE `t_card` (
  `cardid` int(11) NOT NULL,
  `cardno` varchar(18) NOT NULL,
  `uid` int(11) unique ,
  PRIMARY KEY (`cardid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_card
-- ----------------------------
INSERT INTO `t_card` VALUES ('1', '610404200010301230', '1');
