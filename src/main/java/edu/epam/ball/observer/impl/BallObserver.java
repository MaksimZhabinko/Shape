package edu.epam.ball.observer.impl;

import edu.epam.ball.entity.Ball;
import edu.epam.ball.entity.BallParameter;
import edu.epam.ball.entity.Warehouse;
import edu.epam.ball.observer.Observer;
import edu.epam.ball.service.BallService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BallObserver implements Observer<Ball> {
    private static final Logger logger = LogManager.getLogger(BallObserver.class);

    @Override
    public void performedArea(Ball ball) {
        int id = ball.getId();
        BallService service = new BallService();
        Warehouse warehouse = Warehouse.getInstance();
        double area = service.findArea(ball);
        BallParameter ballParameter = warehouse.getId(id);
        ballParameter.setArea(area);
        logger.info("new area {}", area);
    }

    @Override
    public void performedVolume(Ball ball) {
        int id = ball.getId();
        BallService service = new BallService();
        Warehouse warehouse = Warehouse.getInstance();
        double volume = service.findVolume(ball);
        BallParameter ballParameter = warehouse.getId(id);
        ballParameter.setVolume(volume);
        logger.info("new volume {}", volume);
    }
}
