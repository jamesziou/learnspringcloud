/*
 Navicat Premium Data Transfer

 Source Server         : license
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : license

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 09/04/2021 20:53:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `user_code` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '登录账号',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '邮箱',
  `create_time` timestamp(4) NOT NULL COMMENT '创建时间',
  `create_user` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建用户',
  `update_time` timestamp(4) NOT NULL COMMENT '更新时间',
  `update_user` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '更新用户',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uk_user_code`(`user_code`) USING BTREE,
  UNIQUE INDEX `uk_email`(`email`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
