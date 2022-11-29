package com.dena.mirrorman.net.api.request;

import ep.c0;
import ep.x;
import ep.y;
import java.io.File;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class PostGalleryPhotoRequest {
    private static final String CONTENT_TYPE_PNG = "image/png";
    private static final String PART_KEY_CAMPAIGN_ID = "campaign_id";
    private static final String PART_KEY_IMAGE = "image";
    private static final String PART_KEY_TEXT = "text";
    private static final String PART_KEY_TWEET = "tweet";
    private static final String PHOTO_FILE_NAME = "campaign_photo_image.png";
    private final String campaignId;
    private final String campaignPhotoImageFilePath;
    private final String commentText;
    private final boolean isShareTweet;
    private y.a multipartBuilder;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public PostGalleryPhotoRequest(String str, String str2, String str3, boolean z10) {
        p.h(str, "campaignId");
        p.h(str2, "campaignPhotoImageFilePath");
        p.h(str3, "commentText");
        this.campaignId = str;
        this.campaignPhotoImageFilePath = str2;
        this.commentText = str3;
        this.isShareTweet = z10;
        y.a aVar = new y.a(null, 1, null);
        aVar.f(y.f31045k);
        aVar.a(PART_KEY_CAMPAIGN_ID, str);
        aVar.b("image", PHOTO_FILE_NAME, c0.f30798a.c(new File(str2), x.f31036g.b(CONTENT_TYPE_PNG)));
        aVar.a("text", str3);
        aVar.a(PART_KEY_TWEET, String.valueOf(z10));
        this.multipartBuilder = aVar;
    }

    private final String component1() {
        return this.campaignId;
    }

    private final String component2() {
        return this.campaignPhotoImageFilePath;
    }

    private final String component3() {
        return this.commentText;
    }

    private final boolean component4() {
        return this.isShareTweet;
    }

    public static /* synthetic */ PostGalleryPhotoRequest copy$default(PostGalleryPhotoRequest postGalleryPhotoRequest, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = postGalleryPhotoRequest.campaignId;
        }
        if ((i10 & 2) != 0) {
            str2 = postGalleryPhotoRequest.campaignPhotoImageFilePath;
        }
        if ((i10 & 4) != 0) {
            str3 = postGalleryPhotoRequest.commentText;
        }
        if ((i10 & 8) != 0) {
            z10 = postGalleryPhotoRequest.isShareTweet;
        }
        return postGalleryPhotoRequest.copy(str, str2, str3, z10);
    }

    public final c0 build() {
        return this.multipartBuilder.e();
    }

    public final PostGalleryPhotoRequest copy(String str, String str2, String str3, boolean z10) {
        p.h(str, "campaignId");
        p.h(str2, "campaignPhotoImageFilePath");
        p.h(str3, "commentText");
        return new PostGalleryPhotoRequest(str, str2, str3, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PostGalleryPhotoRequest) {
            PostGalleryPhotoRequest postGalleryPhotoRequest = (PostGalleryPhotoRequest) obj;
            return p.c(this.campaignId, postGalleryPhotoRequest.campaignId) && p.c(this.campaignPhotoImageFilePath, postGalleryPhotoRequest.campaignPhotoImageFilePath) && p.c(this.commentText, postGalleryPhotoRequest.commentText) && this.isShareTweet == postGalleryPhotoRequest.isShareTweet;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.campaignId.hashCode() * 31) + this.campaignPhotoImageFilePath.hashCode()) * 31) + this.commentText.hashCode()) * 31;
        boolean z10 = this.isShareTweet;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "PostGalleryPhotoRequest(campaignId=" + this.campaignId + ", campaignPhotoImageFilePath=" + this.campaignPhotoImageFilePath + ", commentText=" + this.commentText + ", isShareTweet=" + this.isShareTweet + ')';
    }
}
