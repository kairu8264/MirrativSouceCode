package ai;

import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final /* synthetic */ class f82 implements bx2 {

    /* renamed from: a  reason: collision with root package name */
    public static final bx2 f3966a = new f82();

    @Override // ai.bx2
    public final Object apply(Object obj) {
        final ArrayList arrayList = (ArrayList) obj;
        if (arrayList.isEmpty()) {
            return null;
        }
        return new wc2(arrayList) { // from class: ai.g82

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList f4365a;

            {
                this.f4365a = arrayList;
            }

            @Override // ai.wc2
            public final void d(Object obj2) {
                ((Bundle) obj2).putStringArrayList("android_permissions", this.f4365a);
            }
        };
    }
}
