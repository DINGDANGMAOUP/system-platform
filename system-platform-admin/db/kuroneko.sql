/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : kuroneko

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 03/03/2021 08:54:05
*/

SET NAMES utf8mb4;
SET
FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_dept
-- ----------------------------
DROP TABLE IF EXISTS `sys_dept`;
CREATE TABLE `sys_dept`
(
    `id`               bigint NOT NULL AUTO_INCREMENT COMMENT '编号',
    `name`             varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '机构名称',
    `parent_id`        bigint                                                 DEFAULT NULL COMMENT '上级机构ID，一级机构为0',
    `order_num`        int                                                    DEFAULT NULL COMMENT '排序',
    `create_by`        varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建人',
    `create_time`      datetime                                               DEFAULT NULL COMMENT '创建时间',
    `last_update_by`   varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '更新人',
    `last_update_time` datetime                                               DEFAULT NULL COMMENT '更新时间',
    `del_flag`         tinyint                                                DEFAULT '0' COMMENT '是否删除  -1：已删除  0：正常',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8 COMMENT='机构管理';

-- ----------------------------
-- Table structure for sys_dict
-- ----------------------------
DROP TABLE IF EXISTS `sys_dict`;
CREATE TABLE `sys_dict`
(
    `id`               bigint                                                  NOT NULL AUTO_INCREMENT COMMENT '编号',
    `value`            varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '数据值',
    `label`            varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标签名',
    `type`             varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '类型',
    `description`      varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '描述',
    `sort`             decimal(10, 0)                                          NOT NULL COMMENT '排序（升序）',
    `create_by`        varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '创建人',
    `create_time`      datetime                                                DEFAULT NULL COMMENT '创建时间',
    `last_update_by`   varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '更新人',
    `last_update_time` datetime                                                DEFAULT NULL COMMENT '更新时间',
    `remarks`          varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注信息',
    `del_flag`         tinyint                                                 DEFAULT '0' COMMENT '是否删除  -1：已删除  0：正常',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='字典表';

-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log`
(
    `id`               bigint NOT NULL AUTO_INCREMENT COMMENT '编号',
    `user_name`        varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci   DEFAULT NULL COMMENT '用户名',
    `operation`        varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci   DEFAULT NULL COMMENT '用户操作',
    `method`           varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '请求方法',
    `params`           varchar(5000) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '请求参数',
    `time`             bigint NOT NULL COMMENT '执行时长(毫秒)',
    `ip`               varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci   DEFAULT NULL COMMENT 'IP地址',
    `create_by`        varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci   DEFAULT NULL COMMENT '创建人',
    `create_time`      datetime                                                 DEFAULT NULL COMMENT '创建时间',
    `last_update_by`   varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci   DEFAULT NULL COMMENT '更新人',
    `last_update_time` datetime                                                 DEFAULT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1771 DEFAULT CHARSET=utf8 COMMENT='系统日志';

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu`
(
    `id`               bigint NOT NULL AUTO_INCREMENT COMMENT '编号',
    `name`             varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '菜单名称',
    `parent_id`        bigint                                                  DEFAULT NULL COMMENT '父菜单ID，一级菜单为0',
    `url`              varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '菜单URL,类型：1.普通页面（如用户管理， /sys/user） 2.嵌套完整外部页面，以http(s)开头的链接 3.嵌套服务器页面，使用iframe:前缀+目标URL(如SQL监控， iframe:/druid/login.html, iframe:前缀会替换成服务器地址)',
    `perms`            varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '授权(多个用逗号分隔，如：sys:user:add,sys:user:edit)',
    `type`             int                                                     DEFAULT NULL COMMENT '类型   0：目录   1：菜单   2：按钮',
    `icon`             varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '菜单图标',
    `order_num`        int                                                     DEFAULT NULL COMMENT '排序',
    `create_by`        varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '创建人',
    `create_time`      datetime                                                DEFAULT NULL COMMENT '创建时间',
    `last_update_by`   varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '更新人',
    `last_update_time` datetime                                                DEFAULT NULL COMMENT '更新时间',
    `del_flag`         tinyint                                                 DEFAULT '0' COMMENT '是否删除  -1：已删除  0：正常',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8 COMMENT='菜单管理';

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`
(
    `id`               bigint NOT NULL AUTO_INCREMENT COMMENT '编号',
    `name`             varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '角色名称',
    `remark`           varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
    `create_by`        varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '创建人',
    `create_time`      datetime                                                DEFAULT NULL COMMENT '创建时间',
    `last_update_by`   varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '更新人',
    `last_update_time` datetime                                                DEFAULT NULL COMMENT '更新时间',
    `del_flag`         tinyint                                                 DEFAULT '0' COMMENT '是否删除  -1：已删除  0：正常',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='角色管理';

-- ----------------------------
-- Table structure for sys_role_dept
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_dept`;
CREATE TABLE `sys_role_dept`
(
    `id`               bigint NOT NULL AUTO_INCREMENT COMMENT '编号',
    `role_id`          bigint                                                 DEFAULT NULL COMMENT '角色ID',
    `dept_id`          bigint                                                 DEFAULT NULL COMMENT '机构ID',
    `create_by`        varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建人',
    `create_time`      datetime                                               DEFAULT NULL COMMENT '创建时间',
    `last_update_by`   varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '更新人',
    `last_update_time` datetime                                               DEFAULT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色机构';

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu`
(
    `id`               bigint NOT NULL AUTO_INCREMENT COMMENT '编号',
    `role_id`          bigint                                                 DEFAULT NULL COMMENT '角色ID',
    `menu_id`          bigint                                                 DEFAULT NULL COMMENT '菜单ID',
    `create_by`        varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建人',
    `create_time`      datetime                                               DEFAULT NULL COMMENT '创建时间',
    `last_update_by`   varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '更新人',
    `last_update_time` datetime                                               DEFAULT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=445 DEFAULT CHARSET=utf8 COMMENT='角色菜单';

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`
(
    `id`               bigint                                                 NOT NULL AUTO_INCREMENT COMMENT '编号',
    `name`             varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
    `password`         varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '密码',
    `salt`             varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '盐',
    `email`            varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '邮箱',
    `mobile`           varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '手机号',
    `status`           tinyint                                                 DEFAULT NULL COMMENT '状态  0：禁用   1：正常',
    `dept_id`          bigint                                                  DEFAULT NULL COMMENT '机构ID',
    `create_by`        varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '创建人',
    `create_time`      datetime                                                DEFAULT NULL COMMENT '创建时间',
    `last_update_by`   varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '更新人',
    `last_update_time` datetime                                                DEFAULT NULL COMMENT '更新时间',
    `del_flag`         tinyint                                                 DEFAULT '0' COMMENT '是否删除  -1：已删除  0：正常',
    PRIMARY KEY (`id`) USING BTREE,
    UNIQUE KEY `name` (`name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8 COMMENT='用户管理';

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role`
(
    `id`               bigint NOT NULL AUTO_INCREMENT COMMENT '编号',
    `user_id`          bigint                                                 DEFAULT NULL COMMENT '用户ID',
    `role_id`          bigint                                                 DEFAULT NULL COMMENT '角色ID',
    `create_by`        varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建人',
    `create_time`      datetime                                               DEFAULT NULL COMMENT '创建时间',
    `last_update_by`   varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '更新人',
    `last_update_time` datetime                                               DEFAULT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=72 DEFAULT CHARSET=utf8 COMMENT='用户角色';

-- ----------------------------
-- Table structure for sys_user_token
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_token`;
CREATE TABLE `sys_user_token`
(
    `id`               bigint                                                  NOT NULL AUTO_INCREMENT COMMENT '编号',
    `user_id`          bigint                                                  NOT NULL,
    `token`            varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'token',
    `expire_time`      datetime                                               DEFAULT NULL COMMENT '过期时间',
    `create_by`        varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建人',
    `create_time`      datetime                                               DEFAULT NULL COMMENT '创建时间',
    `last_update_by`   varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '更新人',
    `last_update_time` datetime                                               DEFAULT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE,
    UNIQUE KEY `token` (`token`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='用户Token';

SET
FOREIGN_KEY_CHECKS = 1;
