package com.dena.mirrorman.net.api.response;

import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class Genres {
    public static final int $stable = 8;
    private final List<Genre> genres;

    public Genres(List<Genre> list) {
        p.h(list, "genres");
        this.genres = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Genres copy$default(Genres genres, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = genres.genres;
        }
        return genres.copy(list);
    }

    public final List<Genre> component1() {
        return this.genres;
    }

    public final Genres copy(List<Genre> list) {
        p.h(list, "genres");
        return new Genres(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Genres) && p.c(this.genres, ((Genres) obj).genres);
    }

    public final List<Genre> getGenres() {
        return this.genres;
    }

    public int hashCode() {
        return this.genres.hashCode();
    }

    public String toString() {
        return "Genres(genres=" + this.genres + ')';
    }
}
