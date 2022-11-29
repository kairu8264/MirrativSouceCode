package ai;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class he2 implements xc2<ie2> {

    /* renamed from: a  reason: collision with root package name */
    public final t43 f4835a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f4836b;

    /* renamed from: c  reason: collision with root package name */
    public final en f4837c;

    public he2(en enVar, t43 t43Var, Context context, byte[] bArr) {
        this.f4837c = enVar;
        this.f4835a = t43Var;
        this.f4836b = context;
    }

    @Override // ai.xc2
    public final s43<ie2> zza() {
        return this.f4835a.h(new Callable(this) { // from class: ai.ge2

            /* renamed from: a  reason: collision with root package name */
            public final he2 f4402a;

            {
                this.f4402a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ie2(new JSONObject());
            }
        });
    }
}
