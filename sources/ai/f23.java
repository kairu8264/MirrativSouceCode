package ai;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class f23 implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final Pattern f3900a;

    public f23(Pattern pattern) {
        Objects.requireNonNull(pattern);
        this.f3900a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f3900a.matcher(str).matches();
    }
}
