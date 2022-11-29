package q7;

import android.content.Context;
import java.io.File;
import q7.d;

/* loaded from: classes.dex */
public final class f extends d {

    /* loaded from: classes.dex */
    public class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f48763a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f48764b;

        public a(Context context, String str) {
            this.f48763a = context;
            this.f48764b = str;
        }

        @Override // q7.d.a
        public File a() {
            File cacheDir = this.f48763a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f48764b != null ? new File(cacheDir, this.f48764b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
