package k5;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public UUID f38422a;

    /* renamed from: b  reason: collision with root package name */
    public a f38423b;

    /* renamed from: c  reason: collision with root package name */
    public androidx.work.b f38424c;

    /* renamed from: d  reason: collision with root package name */
    public Set<String> f38425d;

    /* renamed from: e  reason: collision with root package name */
    public androidx.work.b f38426e;

    /* renamed from: f  reason: collision with root package name */
    public int f38427f;

    /* loaded from: classes.dex */
    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean a() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public s(UUID uuid, a aVar, androidx.work.b bVar, List<String> list, androidx.work.b bVar2, int i10) {
        this.f38422a = uuid;
        this.f38423b = aVar;
        this.f38424c = bVar;
        this.f38425d = new HashSet(list);
        this.f38426e = bVar2;
        this.f38427f = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f38427f == sVar.f38427f && this.f38422a.equals(sVar.f38422a) && this.f38423b == sVar.f38423b && this.f38424c.equals(sVar.f38424c) && this.f38425d.equals(sVar.f38425d)) {
            return this.f38426e.equals(sVar.f38426e);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f38422a.hashCode() * 31) + this.f38423b.hashCode()) * 31) + this.f38424c.hashCode()) * 31) + this.f38425d.hashCode()) * 31) + this.f38426e.hashCode()) * 31) + this.f38427f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f38422a + "', mState=" + this.f38423b + ", mOutputData=" + this.f38424c + ", mTags=" + this.f38425d + ", mProgress=" + this.f38426e + '}';
    }
}
