package payroll;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class OrderModelAssembler implements RepresentationModelAssembler<Order, EntityModel<Order>> {
  @Override
  public EntityModel<Order> toModel(Order entity) {
        return EntityModel.of(entity, linkTo(methodOn(OrderController.class)).withSelfRel(), linkTo(methodOn(OrderController.class)).withRel("orders"));
    }
}
