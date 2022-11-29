package ai;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final /* synthetic */ class h72 implements p33 {

    /* renamed from: a  reason: collision with root package name */
    public static final p33 f4769a = new h72();

    @Override // ai.p33
    public final s43 a(Object obj) {
        final String str = (String) obj;
        return j43.a(new wc2(str) { // from class: ai.i72

            /* renamed from: a  reason: collision with root package name */
            public final String f5131a;

            {
                this.f5131a = str;
            }

            @Override // ai.wc2
            public final void d(Object obj2) {
                ((Bundle) obj2).putString("ms", this.f5131a);
            }
        });
    }
}
