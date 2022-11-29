package al;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ i f13779a = new i();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean startsWith;
        startsWith = str.startsWith(".ae");
        return startsWith;
    }
}
