package async.service.services.search

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.*
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/service")
class SearchController {
    Logger logger = LoggerFactory.getLogger(SearchController.class)

    @RequestMapping(method = RequestMethod.GET)
    public String ping() {
        logger.info("Testing")
        return "Hello"
    }
}