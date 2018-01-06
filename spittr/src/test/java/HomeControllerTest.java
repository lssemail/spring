import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.internal.configuration.injection.MockInjection;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import spittr.data.SpittleRepository;
import spittr.model.Spittle;
import spittr.web.HomeController;
import spittr.web.SpittleController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by lssemail on 2018/1/5.
 */
public class HomeControllerTest {

    @Test
    public void testHomePage() throws Exception {

        HomeController controller = new HomeController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/spittr/"))
                .andExpect(view().name("home"));

    }

//    @Test
//    public void shouldShowRecentSpittles() throws Exception {
//
//        List<Spittle> expectedSpittles = createSpittleList(20);
//        SpittleRepository mockRepository = Mockito.mock(SpittleRepository.class);
//        Mockito.when(mockRepository.findSpittles(Long.MAX_VALUE, 20)).thenReturn(expectedSpittles);
//
//        SpittleController controller = new SpittleController(mockRepository);
//
//        MockMvc mockMvc = standaloneSetup(controller)
//                .setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp"))
//                .build();
//
//        mockMvc.perform(get("/spittles"))
//                .andExpect(view().name("spittles"))
//                .andExpect(model().attributeExists("spittleList"));
//    }

    private List<Spittle> createSpittleList(int count) {

        List<Spittle> spittles = new ArrayList<>();
        for(int i=0; i < count; i++){
            spittles.add(new Spittle("Spittle" + i, new Date()));
        }
        System.out.println(spittles.size());
        return spittles;
    }
}
