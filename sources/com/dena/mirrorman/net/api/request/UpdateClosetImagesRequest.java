package com.dena.mirrorman.net.api.request;

import ep.c0;
import ep.x;
import ep.y;
import java.io.File;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class UpdateClosetImagesRequest {
    private static final String BODY_FILE_NAME = "avatar_body_image.png";
    private static final String CONTENT_TYPE_PNG = "image/png";
    private static final String FACE_FILE_NAME = "avatar_face_image.png";
    private static final String PART_KEY_BODY_IMAGE = "avatar_body_image";
    private static final String PART_KEY_CLOSET_ID = "closet_id";
    private static final String PART_KEY_FACE_IMAGE = "avatar_face_image";
    private final String avatarBodyImageFilePath;
    private final String avatarFaceImageFilePath;
    private final int closetId;
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

    public UpdateClosetImagesRequest(int i10, String str, String str2) {
        p.h(str, "avatarBodyImageFilePath");
        p.h(str2, "avatarFaceImageFilePath");
        this.closetId = i10;
        this.avatarBodyImageFilePath = str;
        this.avatarFaceImageFilePath = str2;
        y.a aVar = new y.a(null, 1, null);
        aVar.f(y.f31045k);
        aVar.a(PART_KEY_CLOSET_ID, String.valueOf(i10));
        c0.a aVar2 = c0.f30798a;
        File file = new File(str2);
        x.a aVar3 = x.f31036g;
        aVar.b(PART_KEY_FACE_IMAGE, FACE_FILE_NAME, aVar2.c(file, aVar3.b(CONTENT_TYPE_PNG)));
        aVar.b(PART_KEY_BODY_IMAGE, BODY_FILE_NAME, aVar2.c(new File(str), aVar3.b(CONTENT_TYPE_PNG)));
        this.multipartBuilder = aVar;
    }

    private final String component2() {
        return this.avatarBodyImageFilePath;
    }

    private final String component3() {
        return this.avatarFaceImageFilePath;
    }

    public static /* synthetic */ UpdateClosetImagesRequest copy$default(UpdateClosetImagesRequest updateClosetImagesRequest, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = updateClosetImagesRequest.closetId;
        }
        if ((i11 & 2) != 0) {
            str = updateClosetImagesRequest.avatarBodyImageFilePath;
        }
        if ((i11 & 4) != 0) {
            str2 = updateClosetImagesRequest.avatarFaceImageFilePath;
        }
        return updateClosetImagesRequest.copy(i10, str, str2);
    }

    public final c0 build() {
        return this.multipartBuilder.e();
    }

    public final int component1() {
        return this.closetId;
    }

    public final UpdateClosetImagesRequest copy(int i10, String str, String str2) {
        p.h(str, "avatarBodyImageFilePath");
        p.h(str2, "avatarFaceImageFilePath");
        return new UpdateClosetImagesRequest(i10, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateClosetImagesRequest) {
            UpdateClosetImagesRequest updateClosetImagesRequest = (UpdateClosetImagesRequest) obj;
            return this.closetId == updateClosetImagesRequest.closetId && p.c(this.avatarBodyImageFilePath, updateClosetImagesRequest.avatarBodyImageFilePath) && p.c(this.avatarFaceImageFilePath, updateClosetImagesRequest.avatarFaceImageFilePath);
        }
        return false;
    }

    public final int getClosetId() {
        return this.closetId;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.closetId) * 31) + this.avatarBodyImageFilePath.hashCode()) * 31) + this.avatarFaceImageFilePath.hashCode();
    }

    public String toString() {
        return "UpdateClosetImagesRequest(closetId=" + this.closetId + ", avatarBodyImageFilePath=" + this.avatarBodyImageFilePath + ", avatarFaceImageFilePath=" + this.avatarFaceImageFilePath + ')';
    }
}
