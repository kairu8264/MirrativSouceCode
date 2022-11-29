package ai;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wd2 implements xc2<xd2> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11574a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11575b;

    /* renamed from: c  reason: collision with root package name */
    public final t43 f11576c;

    public wd2(ke0 ke0Var, Context context, String str, t43 t43Var) {
        this.f11574a = context;
        this.f11575b = str;
        this.f11576c = t43Var;
    }

    @Override // ai.xc2
    public final s43<xd2> zza() {
        return this.f11576c.h(new Callable(this) { // from class: ai.vd2

            /* renamed from: a  reason: collision with root package name */
            public final wd2 f11034a;

            {
                this.f11034a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new xd2(new JSONObject());
            }
        });
    }
}
