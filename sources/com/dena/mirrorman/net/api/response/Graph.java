package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.net.api.response.user.UrgeUser;
import java.util.List;
import jo.p;
import xn.s;

/* loaded from: classes2.dex */
public final class Graph {
    public static final int $stable = 0;

    /* loaded from: classes2.dex */
    public static final class BlockedUserList {
        public static final int $stable = 8;
        private int current_page;
        private int next_page;
        private Status status = Status.Companion.createEmptyStatus();
        private List<UrgeUser> blocked_users = s.k();

        public final List<UrgeUser> getBlocked_users() {
            return this.blocked_users;
        }

        public final int getCurrent_page() {
            return this.current_page;
        }

        public final int getNext_page() {
            return this.next_page;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final void setBlocked_users(List<UrgeUser> list) {
            p.h(list, "<set-?>");
            this.blocked_users = list;
        }

        public final void setCurrent_page(int i10) {
            this.current_page = i10;
        }

        public final void setNext_page(int i10) {
            this.next_page = i10;
        }

        public final void setStatus(Status status) {
            p.h(status, "<set-?>");
            this.status = status;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Follow {
        public static final int $stable = 8;
        private Status status = Status.Companion.createEmptyStatus();

        public final Status getStatus() {
            return this.status;
        }

        public final void setStatus(Status status) {
            p.h(status, "<set-?>");
            this.status = status;
        }
    }

    /* loaded from: classes2.dex */
    public static final class FollowerList {
        public static final int $stable = 8;
        private int currentPage;
        private int nextPage;
        private Status status = Status.Companion.createEmptyStatus();
        private List<UrgeUser> followers = s.k();

        public final int getCurrentPage() {
            return this.currentPage;
        }

        public final List<UrgeUser> getFollowers() {
            return this.followers;
        }

        public final int getNextPage() {
            return this.nextPage;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final void setCurrentPage(int i10) {
            this.currentPage = i10;
        }

        public final void setFollowers(List<UrgeUser> list) {
            p.h(list, "<set-?>");
            this.followers = list;
        }

        public final void setNextPage(int i10) {
            this.nextPage = i10;
        }

        public final void setStatus(Status status) {
            p.h(status, "<set-?>");
            this.status = status;
        }
    }

    /* loaded from: classes2.dex */
    public static final class FollowingList {
        public static final int $stable = 8;
        private int currentPage;
        private int nextPage;
        private Status status = Status.Companion.createEmptyStatus();
        private List<UrgeUser> followings = s.k();

        public final int getCurrentPage() {
            return this.currentPage;
        }

        public final List<UrgeUser> getFollowings() {
            return this.followings;
        }

        public final int getNextPage() {
            return this.nextPage;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final void setCurrentPage(int i10) {
            this.currentPage = i10;
        }

        public final void setFollowings(List<UrgeUser> list) {
            p.h(list, "<set-?>");
            this.followings = list;
        }

        public final void setNextPage(int i10) {
            this.nextPage = i10;
        }

        public final void setStatus(Status status) {
            p.h(status, "<set-?>");
            this.status = status;
        }
    }

    /* loaded from: classes2.dex */
    public static final class KickedUserList {
        public static final int $stable = 8;
        private int current_page;
        private Status status = Status.Companion.createEmptyStatus();
        private List<UrgeUser> kicked_users = s.k();

        public final int getCurrent_page() {
            return this.current_page;
        }

        public final List<UrgeUser> getKicked_users() {
            return this.kicked_users;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final void setCurrent_page(int i10) {
            this.current_page = i10;
        }

        public final void setKicked_users(List<UrgeUser> list) {
            p.h(list, "<set-?>");
            this.kicked_users = list;
        }

        public final void setStatus(Status status) {
            p.h(status, "<set-?>");
            this.status = status;
        }
    }

    /* loaded from: classes2.dex */
    public static final class RecommendUserList {
        public static final int $stable = 8;
        private int current_page;
        private Status status = Status.Companion.createEmptyStatus();
        private List<UrgeUser> users = s.k();

        public final int getCurrent_page() {
            return this.current_page;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final List<UrgeUser> getUsers() {
            return this.users;
        }

        public final void setCurrent_page(int i10) {
            this.current_page = i10;
        }

        public final void setStatus(Status status) {
            p.h(status, "<set-?>");
            this.status = status;
        }

        public final void setUsers(List<UrgeUser> list) {
            p.h(list, "<set-?>");
            this.users = list;
        }
    }

    /* loaded from: classes2.dex */
    public static final class UrgeUserList {
        public static final int $stable = 8;
        private List<UrgeUser> users = s.k();
        private String title = "";
        private String description = "";
        private Status status = Status.Companion.createEmptyStatus();

        public final String getDescription() {
            return this.description;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<UrgeUser> getUsers() {
            return this.users;
        }

        public final void setDescription(String str) {
            p.h(str, "<set-?>");
            this.description = str;
        }

        public final void setStatus(Status status) {
            p.h(status, "<set-?>");
            this.status = status;
        }

        public final void setTitle(String str) {
            p.h(str, "<set-?>");
            this.title = str;
        }

        public final void setUsers(List<UrgeUser> list) {
            p.h(list, "<set-?>");
            this.users = list;
        }
    }
}
