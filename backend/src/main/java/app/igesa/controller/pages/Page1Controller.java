package app.igesa.controller.pages;
import app.igesa.dto.Page1DTO;
import app.igesa.metiers.Ipage1;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

/**
 * @author Wassim Hachani
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class Page1Controller {
    @Autowired
    Ipage1 ipage1;

    private static final Logger log = LoggerFactory.getLogger(Page1Controller.class);


    @RequestMapping(value="/page1",method = RequestMethod.POST)
    @ApiOperation(value="ADD Page",notes="SAUVGARDER PAGE", response = Page1DTO.class)
    @ApiResponses(value= {
            @ApiResponse(code=200,message="pagewas saved Successfully"),
            @ApiResponse(code=400,message="page not valid"),
            @ApiResponse(code=401,message="Unauthorized , without authority or permission"),
            @ApiResponse( code=403, message="not permitted or allowed"),

    })
    ResponseEntity<Page1DTO> save(@RequestBody Page1DTO p) {
        log.debug(" HTTP POST {}",p);
        return new ResponseEntity<> (ipage1.save(p), HttpStatus.CREATED);
    }


    @RequestMapping(value="/page1",method = RequestMethod.GET)
    @ApiOperation(value="GET PAGE",notes="PAGES", responseContainer  = "Collection<Page1DTO>")
    @ApiResponses(value= {
            @ApiResponse(code=200,message="page was founded Successfully"),
            @ApiResponse(code=400,message="page not found"),
            @ApiResponse(code=401,message="Unauthorized , without authority or permission"),
            @ApiResponse( code=403, message="not permitted or allowed"),

    })
    public ResponseEntity<Collection<Page1DTO>> view() {
        log.debug(" HTTP GET ALL privacy  {}");
        return new ResponseEntity<>( ipage1.view(),HttpStatus.OK);
    }

    @RequestMapping(value="/page1/{id}",method = RequestMethod.GET)
    @ApiOperation(value="GET PAGE",notes="GET PAGE", response = Page1DTO.class)
    @ApiResponses(value= {
            @ApiResponse(code=200,message="page by id was founded Successfully"),
            @ApiResponse(code=400,message="page not founded"),
            @ApiResponse(code=401,message="Unauthorized , without authority or permission"),
            @ApiResponse( code=403, message="not permitted or allowed"),

    })
    public ResponseEntity<Page1DTO>findById(@PathVariable Long id) {
        log.debug(" HTTP GET PAGE  BY ID {}",id);
        return new ResponseEntity<>(ipage1.findById(id),HttpStatus.OK);
    }


    @RequestMapping(value="/page1",method =RequestMethod.PUT)
    @ApiOperation(value="UPDATE pages  ",response = Page1DTO.class)
    @ApiResponses(value= {
            @ApiResponse(code=200,message="page was updated successfully"),
            @ApiResponse(code=401,message="Unauthorized , without authority or permission"),
            @ApiResponse( code=403, message="not permitted or allowed"),

    })
    public ResponseEntity<Page1DTO>update(@RequestBody Page1DTO c) {
        return new ResponseEntity<>(ipage1.save(c),HttpStatus.CREATED);
    }

    @RequestMapping(value="/page1/{id}",method =RequestMethod.DELETE)
    @ResponseBody
    @ApiOperation(value="DELETE BY ID ",response = Page1DTO.class)
    @ApiResponses(value= {
            @ApiResponse(code=200,message="Page was Deleted successfully"),
            @ApiResponse(code=401,message="Unauthorized , without authority or permission"),
            @ApiResponse( code=403, message="not permitted or allowed")

    })
    public void delete(@PathVariable Long id) {

        log.debug(" HTTP DELETE BY ID {}",id);

        ipage1.delete(id);
    }

}