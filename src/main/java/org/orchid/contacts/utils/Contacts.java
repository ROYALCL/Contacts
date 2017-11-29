package org.orchid.contacts.utils;

public class Contacts {
        // 数据库表常量
        public static final String ADMINSINFO = "adminsinfo ";
        public static final String GROUPSINFO = "groupsinfo ";
        public static final String CONTACTSINFO = "contactsinfo ";

        /**
         * 定义不需要拦截的请求
         */
        public static final String[] IGNORE_URI = {"/loginForm", "/login", "/404.html"};
        // 登录
        public static final String LOGIN = "/loginForm";
        // 用户的session对象
        public static final String USER_SESSION = "user_session";

        // 默认每页4条数据
        public static int PAGE_DEFAULT_SIZE = 5;
}
