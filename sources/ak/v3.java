package ak;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes3.dex */
public final /* synthetic */ class v3 implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ v3 f13697a = new v3();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean matches;
        matches = w3.f13707a.matcher(str).matches();
        return matches;
    }
}
