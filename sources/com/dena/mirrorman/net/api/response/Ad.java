package com.dena.mirrorman.net.api.response;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import java.util.List;
import ym.c;

/* loaded from: classes2.dex */
public final class Ad {
    public static final int $stable = 0;

    /* loaded from: classes2.dex */
    public static class Actions implements Serializable {
        public static final int $stable = 8;
        @c("actions")
        private List<String> actions;
        @c(TtmlNode.ATTR_ID)

        /* renamed from: id  reason: collision with root package name */
        private String f26143id;

        public final List<String> getActions() {
            return this.actions;
        }

        public final String getId() {
            return this.f26143id;
        }

        public final void setActions(List<String> list) {
            this.actions = list;
        }

        public final void setId(String str) {
            this.f26143id = str;
        }
    }
}
