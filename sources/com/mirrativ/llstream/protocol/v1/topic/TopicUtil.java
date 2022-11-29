package com.mirrativ.llstream.protocol.v1.topic;

import java.util.Arrays;
import java.util.List;
import jo.h;
import jo.p;
import so.o;
import so.q;
import xn.a0;
import xn.s;

/* loaded from: classes4.dex */
public final class TopicUtil {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final boolean isTopicStreamName(String str) {
            p.h(str, "sname");
            Character P0 = q.P0(str);
            if (P0 != null && P0.equals("[")) {
                Character Q0 = q.Q0(str);
                return Q0 != null && Q0.equals("]");
            }
            return false;
        }

        public final String parseTopicStreamName(String str) {
            p.h(str, "sname");
            if (isTopicStreamName(str)) {
                o.k0(str, "[");
                o.l0(str, "]");
                return str;
            }
            throw new TopicException("failed to parse topic");
        }

        public final String toString(String... strArr) {
            p.h(strArr, "stringArgs");
            return toString(s.m(Arrays.copyOf(strArr, strArr.length)));
        }

        public final String toString(List<String> list) {
            p.h(list, "stringArray");
            return a0.g0(list, TopicConstant.SEPARATOR, null, null, 0, null, null, 62, null);
        }
    }
}
