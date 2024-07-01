package in.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Product {

	@Id
	@GeneratedValue
	private Integer pid;
	
	@NotBlank(message="Name is Mandatory")
	@Size(min=3, max=15, message="Name should have only 3 to 15 characters")
	private String name;
	
	@NotNull(message = "Price is mandatory")
	@Positive(message = "Price Should be positive number")
	private Double price;
	
	@NotNull(message = "Quantity is mandatory")
	@Positive(message = "Quantity Should be positive number")
	private Integer quantity;
}
