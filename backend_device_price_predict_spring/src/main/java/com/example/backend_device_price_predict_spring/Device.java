import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Device implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "battery_power")
    private Integer batteryPower; // Total energy a battery can store in one time measured in mAh

    @Column(name = "blue")
    private Boolean hasBluetooth; // Has Bluetooth or not

    @Column(name = "clock_speed")
    private Double clockSpeed; // The speed at which the microprocessor executes instructions

    @Column(name = "dual_sim")
    private Boolean hasDualSim; // Has dual sim support or not

    @Column(name = "fc")
    private Integer frontCameraMegapixels; // Front Camera megapixels

    @Column(name = "four_g")
    private Boolean hasFourG; // Has 4G or not

    @Column(name = "int_memory")
    private Double internalMemory; // Internal Memory in Gigabytes

    @Column(name = "m_dep")
    private Double mobileDepth; // Mobile Depth in cm

    @Column(name = "mobile_wt")
    private Double mobileWeight; // Weight of mobile phone

    @Column(name = "n_cores")
    private Integer numberOfProcessorCores; // Number of cores of the processor

    @Column(name = "pc")
    private Integer primaryCameraMegapixels; // Primary Camera megapixels

    @Column(name = "px_height")
    private Integer pixelResolutionHeight; // Pixel Resolution Height

    @Column(name = "px_width")
    private Integer pixelResolutionWidth; // Pixel Resolution Width

    @Column(name = "ram")
    private Integer ram; // Random Access Memory in Megabytes

    @Column(name = "sc_h")
    private Double screenHeight; // Screen Height of mobile in cm

    @Column(name = "sc_w")
    private Double screenWidth; // Screen Width of mobile in cm

    @Column(name = "talk_time")
    private Integer talkTime; // Longest time that a single battery charge will last

    @Column(name = "three_g")
    private Boolean hasThreeG; // Has 3G or not

    @Column(name = "touch_screen")
    private Boolean hasTouchScreen; // Has touch screen or not

    @Column(name = "wifi")
    private Boolean hasWifi; // Has wifi or not

    @Column(name = "price_range")
    private Integer priceRange; // Predicted price range (0-3)

    // Constructors, getters, setters, and other methods...

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Define getters and setters for all other fields...

}
