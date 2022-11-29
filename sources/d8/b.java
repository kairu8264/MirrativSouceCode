package d8;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<ImageHeaderParser> f29300a = new ArrayList();

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.f29300a.add(imageHeaderParser);
    }

    public synchronized List<ImageHeaderParser> b() {
        return this.f29300a;
    }
}
