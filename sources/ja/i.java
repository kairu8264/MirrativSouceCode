package ja;

/* loaded from: classes.dex */
public enum i {
    LISTING(0, "live_game.list", n.text_livegame_tab_livegame, k.ic_livegame_selected, k.ic_livegame_deselect),
    RANKING(1, "live_game.daily_ranking", n.text_livegame_tab_ranking, k.ic_ranking_selected, k.ic_ranking_unselect);
    
    private final int icon;

    /* renamed from: id  reason: collision with root package name */
    private final String f37411id;
    private final int label;
    private final int rawValue;
    private final int selectedIcon;

    i(int i10, String str, int i11, int i12, int i13) {
        this.rawValue = i10;
        this.f37411id = str;
        this.label = i11;
        this.icon = i12;
        this.selectedIcon = i13;
    }

    public final int c() {
        return this.icon;
    }

    public final int e() {
        return this.label;
    }

    public final String getId() {
        return this.f37411id;
    }

    public final int h() {
        return this.rawValue;
    }

    public final int i() {
        return this.selectedIcon;
    }
}
