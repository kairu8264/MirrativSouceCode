package ai;

import java.util.Collection;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class it2 extends jt2 {

    /* renamed from: c  reason: collision with root package name */
    public final HashSet<String> f5405c;

    /* renamed from: d  reason: collision with root package name */
    public final JSONObject f5406d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5407e;

    /* JADX WARN: Multi-variable type inference failed */
    public it2(bt2 bt2Var, bt2 bt2Var2, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(bt2Var, null);
        this.f5405c = new HashSet<>((Collection<? extends String>) bt2Var2);
        this.f5406d = hashSet;
        this.f5407e = jSONObject;
    }
}
