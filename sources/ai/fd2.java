package ai;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.android.exoplayer2.C;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class fd2 implements xc2<dd2> {

    /* renamed from: a  reason: collision with root package name */
    public final t43 f3994a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f3995b;

    public fd2(t43 t43Var, Context context) {
        this.f3994a = t43Var;
        this.f3995b = context;
    }

    public static ResolveInfo b(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(1:3)(1:54)|4|(1:6)(1:53)|7|(3:9|(2:12|10)|13)|14|(3:46|47|(12:49|50|17|18|19|(7:21|22|23|(2:29|(3:32|(3:35|(2:38|39)(1:37)|33)|40))|25|26|27)|42|23|(0)|25|26|27))|16|17|18|19|(0)|42|23|(0)|25|26|27) */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4 A[Catch: Exception -> 0x00d7, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d7, blocks: (B:27:0x00a6, B:29:0x00b4), top: B:49:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ ai.dd2 a() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.fd2.a():ai.dd2");
    }

    @Override // ai.xc2
    public final s43<dd2> zza() {
        return this.f3994a.h(new Callable(this) { // from class: ai.ed2

            /* renamed from: a  reason: collision with root package name */
            public final fd2 f3614a;

            {
                this.f3614a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f3614a.a();
            }
        });
    }
}
