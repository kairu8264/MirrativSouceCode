package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import jo.p;
import xn.s;
import ym.c;

/* loaded from: classes2.dex */
public final class Chat {
    public static final int $stable = 0;

    /* loaded from: classes2.dex */
    public static final class Join {
        public static final int $stable = 8;
        private int broadcastPort;
        private Status status = Status.Companion.createEmptyStatus();
        private String broadcastHost = "";
        private String broadcastKey = "";
        private String broadcastSecret = "";
        private String isKickedBy = "";
        private List<LastReadMessage> lastReadMessages = s.k();

        /* loaded from: classes2.dex */
        public static final class LastReadMessage {
            public static final int $stable = 8;
            private long invitedMessageId;
            @c("last_read_message_id")
            private long lastReadMessageId;
            @c(LogBase.USER_ID)
            private String userId = "";

            public final long getInvitedMessageId() {
                return this.invitedMessageId;
            }

            public final long getLastReadMessageId() {
                return this.lastReadMessageId;
            }

            public final String getUserId() {
                return this.userId;
            }

            public final void setInvitedMessageId(long j10) {
                this.invitedMessageId = j10;
            }

            public final void setLastReadMessageId(long j10) {
                this.lastReadMessageId = j10;
            }

            public final void setUserId(String str) {
                p.h(str, "<set-?>");
                this.userId = str;
            }
        }

        public final String getBroadcastHost() {
            return this.broadcastHost;
        }

        public final String getBroadcastKey() {
            return this.broadcastKey;
        }

        public final int getBroadcastPort() {
            return this.broadcastPort;
        }

        public final String getBroadcastSecret() {
            return this.broadcastSecret;
        }

        public final List<LastReadMessage> getLastReadMessages() {
            return this.lastReadMessages;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final String isKickedBy() {
            return this.isKickedBy;
        }

        public final void setBroadcastHost(String str) {
            p.h(str, "<set-?>");
            this.broadcastHost = str;
        }

        public final void setBroadcastKey(String str) {
            p.h(str, "<set-?>");
            this.broadcastKey = str;
        }

        public final void setBroadcastPort(int i10) {
            this.broadcastPort = i10;
        }

        public final void setBroadcastSecret(String str) {
            p.h(str, "<set-?>");
            this.broadcastSecret = str;
        }

        public final void setKickedBy(String str) {
            p.h(str, "<set-?>");
            this.isKickedBy = str;
        }

        public final void setLastReadMessages(List<LastReadMessage> list) {
            p.h(list, "<set-?>");
            this.lastReadMessages = list;
        }

        public final void setStatus(Status status) {
            p.h(status, "<set-?>");
            this.status = status;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Message {
        public static final int $stable = 8;
        @c(LogBase.CREATED_AT)
        private long createdAt;
        @c(TtmlNode.ATTR_ID)

        /* renamed from: id  reason: collision with root package name */
        private long f26146id;
        @c(LogBase.USER_ID)
        private String userId = "";
        @c("type")
        private String type = "";
        @c("text")
        private Text text = new Text();
        @c("fixed_image")
        private FixedImage fixedImage = new FixedImage();
        @c("invited")
        private Invited invited = new Invited();
        @c("joined")
        private Joined joined = new Joined();
        @c(TtmlNode.LEFT)
        private Left left = new Left();
        @c("kicked")
        private Kicked kicked = new Kicked();

        /* loaded from: classes2.dex */
        public static final class ContentImage {
            public static final int $stable = 8;
            @c("height")
            private int height;
            @c("url")
            private String url = "";
            @c("width")
            private int width;

            public final int getHeight() {
                return this.height;
            }

            public final String getUrl() {
                return this.url;
            }

            public final int getWidth() {
                return this.width;
            }

            public final void setHeight(int i10) {
                this.height = i10;
            }

            public final void setUrl(String str) {
                p.h(str, "<set-?>");
                this.url = str;
            }

            public final void setWidth(int i10) {
                this.width = i10;
            }
        }

        /* loaded from: classes2.dex */
        public static final class ContentImages {
            public static final int $stable = 8;
            @c("default")
            private ContentImage contentImageDefault = new ContentImage();
            @c("ja")
            private ContentImage contentImageJa = new ContentImage();

            public final ContentImage getContentImageDefault() {
                return this.contentImageDefault;
            }

            public final ContentImage getContentImageJa() {
                return this.contentImageJa;
            }

            public final void setContentImageDefault(ContentImage contentImage) {
                p.h(contentImage, "<set-?>");
                this.contentImageDefault = contentImage;
            }

            public final void setContentImageJa(ContentImage contentImage) {
                p.h(contentImage, "<set-?>");
                this.contentImageJa = contentImage;
            }
        }

        /* loaded from: classes2.dex */
        public static final class FixedImage {
            public static final int $stable = 8;
            @c("user_name")
            private String userName = "";
            @c("avatar_image_url")
            private String avatarImageUrl = "";
            @c("content_image")
            private ContentImages contentImages = new ContentImages();

            public final String getAvatarImageUrl() {
                return this.avatarImageUrl;
            }

            public final ContentImages getContentImages() {
                return this.contentImages;
            }

            public final String getUserName() {
                return this.userName;
            }

            public final void setAvatarImageUrl(String str) {
                p.h(str, "<set-?>");
                this.avatarImageUrl = str;
            }

            public final void setContentImages(ContentImages contentImages) {
                p.h(contentImages, "<set-?>");
                this.contentImages = contentImages;
            }

            public final void setUserName(String str) {
                p.h(str, "<set-?>");
                this.userName = str;
            }
        }

        /* loaded from: classes2.dex */
        public static final class Invited {
            public static final int $stable = 8;
            @c("user_name")
            private String userName = "";
            @c("invited_user_names")
            private List<String> invitedUserNames = s.k();

            public final List<String> getInvitedUserNames() {
                return this.invitedUserNames;
            }

            public final String getUserName() {
                return this.userName;
            }

            public final void setInvitedUserNames(List<String> list) {
                p.h(list, "<set-?>");
                this.invitedUserNames = list;
            }

            public final void setUserName(String str) {
                p.h(str, "<set-?>");
                this.userName = str;
            }
        }

        /* loaded from: classes2.dex */
        public static final class Joined {
            public static final int $stable = 8;
            @c("user_name")
            private String userName = "";

            public final String getUserName() {
                return this.userName;
            }

            public final void setUserName(String str) {
                p.h(str, "<set-?>");
                this.userName = str;
            }
        }

        /* loaded from: classes2.dex */
        public static final class Kicked {
            public static final int $stable = 8;
            @c("user_name")
            private String userName = "";
            @c("kicked_user_names")
            private List<String> kickedUserNames = s.k();
            @c("kicked_user_ids")
            private List<String> kickedUserIds = s.k();

            public final List<String> getKickedUserIds() {
                return this.kickedUserIds;
            }

            public final List<String> getKickedUserNames() {
                return this.kickedUserNames;
            }

            public final String getUserName() {
                return this.userName;
            }

            public final void setKickedUserIds(List<String> list) {
                p.h(list, "<set-?>");
                this.kickedUserIds = list;
            }

            public final void setKickedUserNames(List<String> list) {
                p.h(list, "<set-?>");
                this.kickedUserNames = list;
            }

            public final void setUserName(String str) {
                p.h(str, "<set-?>");
                this.userName = str;
            }
        }

        /* loaded from: classes2.dex */
        public static final class Left {
            public static final int $stable = 8;
            @c("user_name")
            private String userName = "";

            public final String getUserName() {
                return this.userName;
            }

            public final void setUserName(String str) {
                p.h(str, "<set-?>");
                this.userName = str;
            }
        }

        /* loaded from: classes2.dex */
        public static final class Text {
            public static final int $stable = 8;
            @c("user_name")
            private String userName = "";
            @c("avatar_image_url")
            private String avatarImageUrl = "";
            @c(TtmlNode.TAG_BODY)
            private String body = "";

            public final String getAvatarImageUrl() {
                return this.avatarImageUrl;
            }

            public final String getBody() {
                return this.body;
            }

            public final String getUserName() {
                return this.userName;
            }

            public final void setAvatarImageUrl(String str) {
                p.h(str, "<set-?>");
                this.avatarImageUrl = str;
            }

            public final void setBody(String str) {
                p.h(str, "<set-?>");
                this.body = str;
            }

            public final void setUserName(String str) {
                p.h(str, "<set-?>");
                this.userName = str;
            }
        }

        public final long getCreatedAt() {
            return this.createdAt;
        }

        public final FixedImage getFixedImage() {
            return this.fixedImage;
        }

        public final long getId() {
            return this.f26146id;
        }

        public final Invited getInvited() {
            return this.invited;
        }

        public final Joined getJoined() {
            return this.joined;
        }

        public final Kicked getKicked() {
            return this.kicked;
        }

        public final Left getLeft() {
            return this.left;
        }

        public final Text getText() {
            return this.text;
        }

        public final String getType() {
            return this.type;
        }

        public final String getUserId() {
            return this.userId;
        }

        public final void setCreatedAt(long j10) {
            this.createdAt = j10;
        }

        public final void setFixedImage(FixedImage fixedImage) {
            p.h(fixedImage, "<set-?>");
            this.fixedImage = fixedImage;
        }

        public final void setId(long j10) {
            this.f26146id = j10;
        }

        public final void setInvited(Invited invited) {
            p.h(invited, "<set-?>");
            this.invited = invited;
        }

        public final void setJoined(Joined joined) {
            p.h(joined, "<set-?>");
            this.joined = joined;
        }

        public final void setKicked(Kicked kicked) {
            p.h(kicked, "<set-?>");
            this.kicked = kicked;
        }

        public final void setLeft(Left left) {
            p.h(left, "<set-?>");
            this.left = left;
        }

        public final void setText(Text text) {
            p.h(text, "<set-?>");
            this.text = text;
        }

        public final void setType(String str) {
            p.h(str, "<set-?>");
            this.type = str;
        }

        public final void setUserId(String str) {
            p.h(str, "<set-?>");
            this.userId = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Thread {
        public static final int $stable = 8;
        @c("group_id")
        private String groupId;
        @c("group_name_edited")
        private int groupNameEdited;
        @c("group_user_num")
        private int groupUserNum;
        @c("is_new")
        private int isNew;
        @c("is_visible")
        private int isVisible;
        @c("last_posted_at")
        private long lastPostedAt;
        @c("push_enabled")
        private int pushEnabled;
        @c(LogBase.USER_ID)
        private String userId;
        @c("title")
        private String title = "";
        @c("image_urls")
        private List<String> imageUrls = s.k();
        @c("last_message")
        private String lastMessage = "";
        @c("unread_num")
        private String unreadNum = "";

        public final String getGroupId() {
            return this.groupId;
        }

        public final int getGroupNameEdited() {
            return this.groupNameEdited;
        }

        public final int getGroupUserNum() {
            return this.groupUserNum;
        }

        public final List<String> getImageUrls() {
            return this.imageUrls;
        }

        public final String getLastMessage() {
            return this.lastMessage;
        }

        public final long getLastPostedAt() {
            return this.lastPostedAt;
        }

        public final int getPushEnabled() {
            return this.pushEnabled;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getUnreadNum() {
            return this.unreadNum;
        }

        public final String getUserId() {
            return this.userId;
        }

        public final int isNew() {
            return this.isNew;
        }

        public final int isVisible() {
            return this.isVisible;
        }

        public final void setGroupId(String str) {
            this.groupId = str;
        }

        public final void setGroupNameEdited(int i10) {
            this.groupNameEdited = i10;
        }

        public final void setGroupUserNum(int i10) {
            this.groupUserNum = i10;
        }

        public final void setImageUrls(List<String> list) {
            p.h(list, "<set-?>");
            this.imageUrls = list;
        }

        public final void setLastMessage(String str) {
            p.h(str, "<set-?>");
            this.lastMessage = str;
        }

        public final void setLastPostedAt(long j10) {
            this.lastPostedAt = j10;
        }

        public final void setNew(int i10) {
            this.isNew = i10;
        }

        public final void setPushEnabled(int i10) {
            this.pushEnabled = i10;
        }

        public final void setTitle(String str) {
            p.h(str, "<set-?>");
            this.title = str;
        }

        public final void setUnreadNum(String str) {
            p.h(str, "<set-?>");
            this.unreadNum = str;
        }

        public final void setUserId(String str) {
            this.userId = str;
        }

        public final void setVisible(int i10) {
            this.isVisible = i10;
        }
    }
}
