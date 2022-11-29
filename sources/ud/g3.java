package ud;

import android.content.Context;
import com.dena.mirrativ.mirrativapi.user.LabelRemainingPeriod;

/* loaded from: classes2.dex */
public final class g3 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f54965c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f54966a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f54967b;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g3 a(Context context, LabelRemainingPeriod labelRemainingPeriod) {
            jo.p.h(context, "context");
            jo.p.h(labelRemainingPeriod, "labelRemainingPeriod");
            return new g3(labelRemainingPeriod.getText(), Integer.valueOf(c3.a.d(context, labelRemainingPeriod.isHighlight() ? nd.w0.f42231f0 : nd.w0.f42240r0)));
        }
    }

    public g3(String str, Integer num) {
        jo.p.h(str, "text");
        this.f54966a = str;
        this.f54967b = num;
    }

    public final String a() {
        return this.f54966a;
    }

    public final Integer b() {
        return this.f54967b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g3) {
            g3 g3Var = (g3) obj;
            return jo.p.c(this.f54966a, g3Var.f54966a) && jo.p.c(this.f54967b, g3Var.f54967b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f54966a.hashCode() * 31;
        Integer num = this.f54967b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "RibbonRemainingLabelBindModel(text=" + this.f54966a + ", textColor=" + this.f54967b + ')';
    }
}
