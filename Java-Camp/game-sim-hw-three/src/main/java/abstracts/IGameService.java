package abstracts;


import entity.Game;

public interface IGameService {
    public void add(Game game);
    public void update(Game game);
    public void delete(Game game);
}
