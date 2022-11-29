package ba;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunEventResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes.dex */
public abstract class u {

    /* loaded from: classes.dex */
    public static final class a extends u {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f17199a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f17199a = mRError;
        }

        public final MRError a() {
            return this.f17199a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f17199a, ((a) obj).f17199a);
        }

        public int hashCode() {
            return this.f17199a.hashCode();
        }

        public String toString() {
            return "FetchEmomoRunEventFailed(error=" + this.f17199a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends u {

        /* renamed from: a  reason: collision with root package name */
        public static final b f17200a = new b();

        public b() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends u {

        /* renamed from: a  reason: collision with root package name */
        public final EmomoRunEventResponse f17201a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EmomoRunEventResponse emomoRunEventResponse) {
            super(null);
            jo.p.h(emomoRunEventResponse, "emomoRunEvent");
            this.f17201a = emomoRunEventResponse;
        }

        public final EmomoRunEventResponse a() {
            return this.f17201a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f17201a, ((c) obj).f17201a);
        }

        public int hashCode() {
            return this.f17201a.hashCode();
        }

        public String toString() {
            return "FetchEmomoRunEventSucceeded(emomoRunEvent=" + this.f17201a + ')';
        }
    }

    public u() {
    }

    public /* synthetic */ u(jo.h hVar) {
        this();
    }
}
