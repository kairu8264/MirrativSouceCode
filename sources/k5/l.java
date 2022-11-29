package k5;

import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import k5.u;

/* loaded from: classes.dex */
public final class l extends u {

    /* loaded from: classes.dex */
    public static final class a extends u.a<a, l> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f38433c.f53195d = OverwritingInputMerger.class.getName();
        }

        @Override // k5.u.a
        /* renamed from: g */
        public l c() {
            if (this.f38431a && Build.VERSION.SDK_INT >= 23 && this.f38433c.f53201j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new l(this);
        }

        @Override // k5.u.a
        /* renamed from: h */
        public a d() {
            return this;
        }
    }

    public l(a aVar) {
        super(aVar.f38432b, aVar.f38433c, aVar.f38434d);
    }

    public static l d(Class<? extends ListenableWorker> cls) {
        return new a(cls).b();
    }
}
